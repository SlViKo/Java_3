package LessonSix;

import java.util.concurrent.Semaphore;

public class Tunnel extends Stage {
    private static Semaphore smp; // ограничение на везд одновременно двух машин в тунель
    public Tunnel() {
        this.length = 80;
        this.description = "Тоннель " + length + " метров";
    }
    @Override
    public void go(Car c) {
        try {
            try {
                System.out.println(c.getName() + " готовится к этапу(ждет): " + description);
                smp.acquire(); // дает доступ только 2 машинам, остальные ждут
                System.out.println(c.getName() + " начал этап: " + description);
                Thread.sleep(length / c.getSpeed() * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println(c.getName() + " закончил этап: " + description);
                smp.release(); // освобождает тунель, для ожидающих машин
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void setSmp(Semaphore smp) {
        Tunnel.smp = smp;
    }
}
