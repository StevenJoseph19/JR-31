package com.mycompany;

public class AllocateSpeed {
    public static void main(String... args) throws Exception {
        int i = 0;
        while (true) {
            new GCMe2();
            i++;
            // 5000000 with finalization
            // 500000000 without
            if(i % 5000000 == 0){
                System.out.printf(".");
            }
        }
    }

}

class GCMe2 {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
