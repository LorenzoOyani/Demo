package Binary_Text_IO;

import java.io.IOException;

public class RandomAccess {
    void main() throws IOException {
        try( java.io.RandomAccessFile random = new java.io.RandomAccessFile("text.txt", "rw");){
            random.setLength(0); // reset the bytes in files

            for(int i = 0; i < 200; i++){
                random.writeInt(i);
            }
            System.out.println("current file length " + random.length());
            random.seek(0);
            System.out.println("first number " + random.readInt());

            random.seek(4);
            System.out.println("second number " + random.readInt());

            random.seek(9 * 4);
            System.out.println("tenth number " + random.readInt());

            random.writeInt(555);

            random.seek(random.length());
            random.writeInt(999);
//            System.out.println(random.);




        }

    }
}