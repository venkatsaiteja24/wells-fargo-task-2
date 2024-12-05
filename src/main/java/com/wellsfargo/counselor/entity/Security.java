package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Security {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long securityID;

    @Column(nullable = false, unique = true)
    private String symbol;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Double price;

    @OneToMany(mappedBy = "security", cascade = CascadeType.ALL)
    private List<PortfolioSecurity> portfolioSecurities;

    protected Security() {}

    public Security(String symbol, String name, Double price) {
        this.symbol = symbol;
        this.name = name;
        this.price = price;
    }

    // Getters and setters
    public Long getSecurityID() {
        return securityID;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public List<PortfolioSecurity> getPortfolioSecurities() {
        return portfolioSecurities;
    }

    public void setPortfolioSecurities(List<PortfolioSecurity> portfolioSecurities) {
        this.portfolioSecurities = portfolioSecurities;
    }
}
