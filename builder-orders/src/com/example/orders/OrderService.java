package com.example.orders;

import java.util.List;

public class OrderService {

    public Order createOrder(String id, String email, List<OrderLine> lines,
                             Integer discount, boolean expedited, String notes) {
        if (lines == null || lines.isEmpty()) {
            throw new IllegalArgumentException("Order must have at least one line");
        }

        Order.Builder builder = new Order.Builder(id, email)
                .expedited(expedited)
                .notes(notes)
                .discountPercent(discount);

        for (OrderLine line : lines) {
            builder.addLine(line);
        }

        return builder.build();
    }
}
