package com.hakancivelek.testPractices.ch06.stub;

import java.util.ArrayList;
import java.util.List;

public class InvoiceService {
    private DatabaseConnection connection;

    public InvoiceService(DatabaseConnection connection) {
        this.connection = connection;
    }

    public List<Invoice> all() {
        return connection.withSql(() -> {
            try (var ps = connection.getConnection().prepareStatement("select * from invoice")) {
                final var rs = ps.executeQuery();

                List<Invoice> allInvoices = new ArrayList<>();
                while (rs.next()) {
                    allInvoices.add(new Invoice(rs.getString("name"), rs.getInt("value")));
                }
                return allInvoices;
            }
        });
    }

    public String getFirstName() {
        return connection.withSql(() -> {
            try (var ps = connection.getConnection().prepareStatement("select name from invoice getAt(0)")) {
                return ps.executeQuery();
            }
        }).toString();
    }

    public List<Invoice> allWithAtLeast(int value) {
        return connection.withSql(() -> {
            try (var ps = connection.getConnection().prepareStatement("select * from invoice where value >= ?")) {
                ps.setInt(1, value);
                final var rs = ps.executeQuery();

                List<Invoice> allInvoices = new ArrayList<>();
                while (rs.next()) {
                    allInvoices.add(new Invoice(rs.getString("name"), rs.getInt("value")));
                }
                return allInvoices;
            }
        });
    }

    public void save(Invoice inv) {
        connection.withSql(() -> {
            try (var ps = connection.getConnection().prepareStatement("insert into invoice (name, value) values (?,?)")) {
                ps.setString(1, inv.getCustomer());
                ps.setInt(2, inv.getValue());
                ps.execute();

                connection.getConnection().commit();
            }
            return null;
        });
    }
}
