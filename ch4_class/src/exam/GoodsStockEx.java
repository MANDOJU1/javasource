package exam;

public class GoodsStockEx {

  public static void main(String[] args) {
    GoodStock goodStock = new GoodStock("p1011", 150);

    int stockNum = goodStock.addStock(20); // 재고수량 추가
    System.out.println("현재 재고 수량 " + stockNum);

    int result1 = goodStock.subtrackStoke(100);
    System.out.println("현재 재고 수량 " + result1);
  }
}
