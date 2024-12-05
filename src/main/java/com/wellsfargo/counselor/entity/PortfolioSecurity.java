package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class PortfolioSecurity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "portfolioID", nullable = false)
    private Portfolio portfolio;

    @ManyToOne
    @JoinColumn(name = "securityID", nullable = false)
    private Security security;

    @Column(nullable = false)
    private Integer quantity;

    protected PortfolioSecurity() {}

    public PortfolioSecurity(Portfolio portfolio, Security security, Integer quantity) {
        this.portfolio = portfolio;
        this.security = security;
        this.quantity = quantity;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    public Security getSecurity() {
        return security;
    }

    public void setSecurity(Security security) {
        this.security = security;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
