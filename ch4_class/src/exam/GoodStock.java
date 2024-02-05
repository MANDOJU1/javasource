package exam;

public class GoodStock {

  // 속성 - 상품코드(p1011) goodsCode, 재고수량(300) stockNum
  private String goodsCode;
  private int GoodStock;

  // 생성자
  public GoodStock() {
    //default 생성자
  }

  public GoodStock(String goodsCode, int goodStock) {
    this.goodsCode = goodsCode;
    GoodStock = goodStock;
  }
}
