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
        MenuComponent anotherDissertMenu =
                new Menu("ANOTHER DESSERT MENU", "ANOTHER DESSERT MENU!");

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
        dessertMenu.add(anotherDissertMenu);
        anotherDissertMenu.add(new MenuItem(
                "Another dissert",
                "Will be repeated three times",
                true,
                1.22
        ));

        pancakeHouseMenu.add(new MenuItem(
                "Pancake's food",
                "Pancake with blueberries",
                true,
                2.44
        ));

        Waitress waitress = new Waitress(allMenus);
        // 在组件内部通过递归来打印该组件的所有元素
        waitress.printMenu();
        // 在组件外部通过组合迭代器,迭代组件的所有元素
        System.out.println("\n\n\n---------------- Use composite iterator ------------");
        waitress.printVegetarianMenu();
    }
}
