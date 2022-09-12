package by.teachmeskills.classwork.lesson14;

public enum Month {
    //���� ��� ������ ������������ ��� �������� �����-�� ���������� �������� (���������� ��������, ������,
    // ��� ������, �� ������ 12 � ��� ������ ����������)
    //�������� �������� ����� �������� �������

    JANUARY(1), FEBRUARY(2), MARCH(3);

    private final int number;

    Month(int number) {
        this.number=number;
    }

    public int getNumber() {
        return number;
    }
}
