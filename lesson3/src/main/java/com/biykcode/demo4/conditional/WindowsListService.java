package com.biykcode.demo4.conditional;

public class WindowsListService implements ListService{
    @Override
    public String showListCmd() {
        return "dir";
    }
}
