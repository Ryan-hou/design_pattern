package com.github.ryan.iterator_pattern.withJdk;

import com.github.ryan.iterator_pattern.withoutJdk.PancakeHouseIterator;

/**
 * @author Ryan-hou
 * @description:
 * @className: MenuTestDrive
 * @date February 16,2017
 */
public class MenuTestDrive {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
        waitress.printMenu();
    }
}
