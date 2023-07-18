package StringOperation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ZTransferTest {
    @Test
    public void testConvert() {
        ZTransfer zTransfer = new ZTransfer();

        // 输入测试数据
        String s1 = "PAYPALISHIRING";
        int numRows1 = 3;
        String s2 = "PAYPALISHIRING";
        int numRows2 = 4;

        // 执行代码并测量运行时间
        long startTime = System.nanoTime();
        String result1 = zTransfer.convert(s1, numRows1);
        String result2 = zTransfer.convert(s2, numRows2);
        long endTime = System.nanoTime();

        // 验证结果
        assertEquals("PAHNAPLSIIGYIR", result1);
        assertEquals("PINALSIGYAHRPI", result2);

        // 输出运行时间
        long duration = endTime - startTime;
        System.out.println("运行时间: " + duration + " 纳秒");
    }
}