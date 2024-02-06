package exam;

public class GoodStock {

  // 속성 - 상품코드(p1011) goodsCode, 재고수량(300) stockNum
  private String goodsCode;
  private int stockNum;

  // 메소드
  // 재고수량 추가  addStock(int amount)
  int addStock(int amount) {
    stockNum += amount;
    return stockNum;
  }

  // 재고수량 감소  subtrackStoke(int amount)
  int subtrackStoke(int amount) {
    stockNum -= amount;
    return stockNum;
  }

  // 생성자
  public GoodStock() {
    //default 생성자
  }

  public GoodStock(String goodsCode, int stockNum) {
    this.goodsCode = goodsCode;
    this.stockNum = stockNum;
  }
}
