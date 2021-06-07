package com.revature.services;

import java.util.Scanner;

public interface AccountServices {
	boolean withdraw(Integer account_id, Float amount);
	boolean deposit(Integer account_id, Float amount);
	boolean transfer(Integer from_id, Integer to_id, Float amount);
	void apply(Float amount);
}