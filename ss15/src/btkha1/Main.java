package btkha1;

import btkha1.EditAction;
import btkha1.MedicalRecordHistory;

public class Main {
    public static void main(String[] args) {

        MedicalRecordHistory history = new MedicalRecordHistory();

        history.addEdit(new EditAction("Cập nhật triệu chứng", "10:00"));
        history.addEdit(new EditAction("Thêm kết quả xét nghiệm", "10:05"));
        history.addEdit(new EditAction("Chỉnh sửa đơn thuốc", "10:10"));

        System.out.println("Lịch sử chỉnh sửa:");
        history.displayHistory();

        System.out.println("\nChỉnh sửa gần nhất:");
        System.out.println(history.getLatestEdit());

        System.out.println("\nUndo:");
        System.out.println(history.undoEdit());

        System.out.println("\nSau khi undo:");
        history.displayHistory();
    }
}