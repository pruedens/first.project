package homework4;

/* Попробуйте реализовать класс по его описанию: объекты класса Коробка должны иметь размеры и цвет.
Коробку можно открывать и закрывать. Коробку можно перекрашивать. Изменить размер коробки после
создания нельзя. У коробки должен быть метод, печатающий информацию о ней в консоль. В коробку можно
складывать предмет (если в ней нет предмета), или выкидывать его оттуда (только если предмет в ней есть),
только при условии что коробка открыта (предметом читаем просто строку). Выполнение методов должно
сопровождаться выводом сообщений в консоль. */

public class Box {
    private final int length;
    private final int width;
    private final int depth;
    private String color;
    private String object;
    private boolean isOpen;

    public Box(int length, int width, int depth, String color) {
        this.length = length;
        this.width = width;
        this.depth = depth;
        this.color = color;
        this.object = null;
        this.isOpen = false;
    }

    public void paint(String newColor) {
        this.color = newColor;
        System.out.println("Коробка перекрашена в новый цвет: " + newColor);
    }

    public void open() {
        if (!isOpen) {
            isOpen = true;
            System.out.println("Коробка открыта.");
        } else {
            System.out.println("Коробка уже была открыта.");
        }
    }

    public void close() {
        if (isOpen) {
            isOpen = false;
            System.out.println("Коробка закрыта.");
        } else {
            System.out.println("Коробка уже была закрыта.");
        }
    }

    public void printInfo() {
        System.out.println("Размеры коробки: Длина: " + length + " Ширина: " + width + " Глубина: " + depth);
        System.out.println("Цвет коробки: " + color);
        if (isOpen) {
            System.out.println("Коробка открыта.");
        } else {
            System.out.println("Коробка закрыта.");
        }
        if (object != null) {
            System.out.println("Предмет в коробке: " + object);
        } else {
            System.out.println("В коробке нет предмета");
        }
    }

    public void putObject(String item) {
        if (isOpen) {
            if (this.object == null) {
                this.object = item;
                System.out.println("Предмет '" + item + "' помещен в коробку.");
            } else {
                System.out.println("В коробке уже есть предмет.");
            }
        } else {
            System.out.println("Для того, чтобы положить предмет, коробка должна быть открыта.");
        }
    }

    public void throwObject() {
        if (isOpen) {
            if (object != null) {
                System.out.println("Предмет '" + object + "' вытащен из коробки.");
                this.object = null;
            } else {
                System.out.println("В коробке нет предмета для вытаскивания.");
            }
        } else {
            System.out.println("Для того, чтобы вытащить предмет, коробка должна быть открыта.");
        }
    }

    public boolean isOpen() {
        return isOpen;
    }
}