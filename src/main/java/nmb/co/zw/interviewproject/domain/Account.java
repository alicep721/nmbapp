package nmb.co.zw.interviewproject.domain;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "accountnumber")
    private String accountNumber;

    @Column(name = "creationdate")
    private LocalDateTime creationDate;

    @Column(name = "currency")
    private String currency;

    @Column(name = "mobilenumber")
    private String mobileNumber;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "branch_id", referencedColumnName = "id")
    private Branch branch;

    @Column(name = "initialbalance")
    private Double initialBalance;

    @Column(name = "activebalance")
    private Double activeBalance;

    @Column(name = "debitamount")
    private Double debitAmount;

    @Column(name = "creditamount")
    private Double creditAmount;

    @Column(name = "creditnarration")
    private String creditNarration;

    @Column(name = "debitnarration")
    private String debitNarration;

    @ManyToOne
    @JoinColumn(name="customer_id", nullable=false)
    private Customer customer;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public Double getInitialBalance() {
        return initialBalance;
    }

    public void setInitialBalance(Double initialBalance) {
        this.initialBalance = initialBalance;
    }

    public Double getActiveBalance() {
        return activeBalance;
    }

    public void setActiveBalance(Double activeBalance) {
        this.activeBalance = activeBalance;
    }

    public Double getDebitAmount() {
        return debitAmount;
    }

    public void setDebitAmount(Double debitAmount) {
        this.debitAmount = debitAmount;
    }

    public Double getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(Double creditAmount) {
        this.creditAmount = creditAmount;
    }

    public String getCreditNarration() {
        return creditNarration;
    }

    public void setCreditNarration(String creditNarration) {
        this.creditNarration = creditNarration;
    }

    public String getDebitNarration() {
        return debitNarration;
    }

    public void setDebitNarration(String debitNarration) {
        this.debitNarration = debitNarration;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @PrePersist
    private void init(){
        creationDate = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", accountNumber='" + accountNumber + '\'' +
                ", creationDate=" + creationDate +
                ", currency='" + currency + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", branch=" + branch +
                ", initialBalance=" + initialBalance +
                ", activeBalance=" + activeBalance +
                ", debitAmount=" + debitAmount +
                ", creditAmount=" + creditAmount +
                ", creditNarration='" + creditNarration + '\'' +
                ", debitNarration='" + debitNarration + '\'' +
                ", customer=" + customer +
                '}';
    }
}
