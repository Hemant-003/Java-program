package service;

import models.Transaction;

import java.util.List;

public interface ExpenseSimplifier {
    List<Transaction> statement();

    List<Transaction> statement(int month);

    int dues(Person person);
}

