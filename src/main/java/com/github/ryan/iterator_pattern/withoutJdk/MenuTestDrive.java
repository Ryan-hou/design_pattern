package com.github.ryan.iterator_pattern.withoutJdk;

/**
 * @author Ryan-hou
 * @description:
 * @className: MenuTestDrive
 * @date February 15,2017
 */
public class MenuTestDrive {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
        waitress.printMenu();
    }
}
