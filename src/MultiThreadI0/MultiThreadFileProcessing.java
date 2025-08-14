package MultiThreadI0;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MultiThreadFileProcessing {
    public static void main(String[] args) {
        // Đọc file Input
        List<Integer> numbers = readNumbersFromFile("input.txt");
        if (numbers.isEmpty()) {
            System.out.println("No input file found.");
            return;
        }

        //lết quả
        final long[] evenSum = {0};
        final long[] oddSum = {0};

        //Thread tiisnh tổng số chẵn
        Thread evenThread = new  Thread(() -> {
            for (int num : numbers) {
                if(num % 2 == 0) {
                    evenSum[0] += num;
                }
            }
            System.out.println("Even Sum: " + evenSum[0]);
        });

        //Thread tính tổng số lẻ
        Thread oddThread = new  Thread(() -> {
            for(int num : numbers) {
                if(num % 2 != 0) {
                    oddSum[0] += num;
                }
            }
            System.out.println("Odd Sum: " + oddSum[0]);
        });

        //Bắt đầu Thread
        evenThread.start();
        oddThread.start();

        //Chờ thread hoàn thành
        try {
            evenThread.join();
            oddThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Ghi kết quả vào file
        writeResultsToFile("output.txt",evenSum[0],oddSum[0]);
    }

    // Phương thức đọc file
    private static List<Integer> readNumbersFromFile(String fileName) {
        List<Integer> numbers = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextInt()) {
                numbers.add(scanner.nextInt());
            }
        } catch (FileNotFoundException e) {
            System.err.println("File không tồn tại: " + e.getMessage());        }
        return numbers;
    }


    // Phương thức ghi file
    private static void writeResultsToFile(String filename, long evenSum, long oddSum) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            writer.println("Tổng số chẵn: " + evenSum);
            writer.println("Tổng số lẻ: " + oddSum);
            System.out.println("Kết quả đã ghi vào " + filename);
        } catch (IOException e) {
            System.err.println("Lỗi ghi file: " + e.getMessage());
        }
    }
}
