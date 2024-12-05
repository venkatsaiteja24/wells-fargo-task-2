package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long portfolioID;

    @ManyToOne
    @JoinColumn(name = "clientID", nullable = false)
    private Client client;

    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "portfolio", cascade = CascadeType.ALL)
    private List<PortfolioSecurity> portfolioSecurities;

    protected Portfolio() {}

    public Portfolio(Client client, String name) {
        this.client = client;
        this.name = name;
    }

    // Getters and setters
    public Long getPortfolioID() {
        return portfolioID;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<PortfolioSecurity> getPortfolioSecurities() {
        return portfolioSecurities;
    }

    public void setPortfolioSecurities(List<PortfolioSecurity> portfolioSecurities) {
        this.portfolioSecurities = portfolioSecurities;
    }
}
