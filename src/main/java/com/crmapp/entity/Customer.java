package com.crmapp.entity;

import jakarta.persistence.*;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String phone;
    private String company;

    // Getters and setters
}
// {
//   "customer": {
//     "name": "Alice Johnson",
//     "email": "alice@example.com",
//     "phone": "9876543210",
//     "company": "TechCorp Inc."
//   },
//   "status": "New",
//   "notes": "Interested in premium plan"
// }
