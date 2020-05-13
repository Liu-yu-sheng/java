System.out.println("嵌套循环");
// 确定行数
for (int p=1; p<10; p++) {
    // 确定列数
    for (int q=1; q<=p; q++) {
	System.out.print(Integer.toString(q) + "x" + Integer.toString(p) + "=" +Integer.toString(q*p)+ "  ");
    }
    System.out.println("");
}
