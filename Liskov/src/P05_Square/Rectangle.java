package P05_Square;

class Rectangle {
    protected int m_width;
    protected int m_height;

    Rectangle(int width, int height) {
        this.m_width = width;
        this.m_height= height;
    }

    public int getWidth() {
        return m_width;
    }

    public int getHeight() {
        return m_height;
    }

    public int getArea() {
        return m_width * m_height;
    }
}
