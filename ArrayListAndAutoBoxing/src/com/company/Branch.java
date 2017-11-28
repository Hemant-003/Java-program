package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Branch {
    public ArrayList <String>BranchName = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    int i;
    String Branchname;

    public void AddBranch() {
        System.out.println("Enter name of the branch");
        String name = scanner.next();
        BranchName.add(name);
        System.out.println("Branch name succesfully added ");
    }
    public void RemoveBranch(){
        System.out.println("Enter branch name you want to remove");
        String name = scanner.next();
        BranchName.remove(name);
        System.out.println("Branch name successfully removed");

    }
    public void PrintBranchName() {
        System.out.println("Number of branches : " + BranchName.size());
        for (i = 0; i < BranchName.size(); i++) {
            System.out.println(BranchName.get(i));
        }
    }

    public void ModifyBranchName(){
        System.out.println("Enter branch name you want to mdoify");
        String name = scanner.next();
        int index = BranchName.indexOf(name);
        System.out.println("Enter new branch name");
        String newName = scanner.next();
        BranchName.set(index,newName);
    }
}
