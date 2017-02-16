package com.github.ryan.composite_pattern;

/**
 * @author Ryan-hou
 * @description:
 * @className: MenuTestDrive
 * @date February 16,2017
 */
public class MenuTestDrive {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu =
                new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu =
                new Menu("DINNER MENU", "Lunch");
        MenuComponent dessertMenu =
                new Menu("DESSERT MENU", "Dessert of course!");

        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);

        // 加入菜单项
        dinerMenu.add(new MenuItem(
                "Pasta",
                "Spaghetti with Marinara Sauce",
                true,
                9.8
        ));
        dinerMenu.add(new MenuItem(
                "Cake",
                "Cake by hands",
                false,
                1
        ));

        dinerMenu.add(dessertMenu);
        dessertMenu.add(new MenuItem(
                "Apple pie",
                "Apple pie with a flakey crust, topped with vanilla ice cream",
                true,
                3.45
        ));

        pancakeHouseMenu.add(new MenuItem(
                "Pancake's food",
                "Pancake with blueberries",
                true,
                2.44
        ));

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();

    }
}
