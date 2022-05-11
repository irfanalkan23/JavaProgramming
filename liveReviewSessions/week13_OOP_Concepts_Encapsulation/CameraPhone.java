package week13_OOP_Concepts_Encapsulation;

public class CameraPhone extends Phone{

    int imageSize;
    int memorySize;

    public CameraPhone(int x, int y) {
        imageSize = x;
        memorySize = y;
    }

    public CameraPhone() {}

    public int numPictures() {
        return memorySize * 1000 / imageSize;
    }



}
