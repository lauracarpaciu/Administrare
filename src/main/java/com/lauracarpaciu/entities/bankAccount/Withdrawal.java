package com.lauracarpaciu.entities.bankAccount;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("R")
public class Withdrawal extends Operation {

}
