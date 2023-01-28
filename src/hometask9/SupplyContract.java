package by.teachmeskills.accountingsystem;

import java.util.Date;

/*
Контракт на поставку товаров. Содержит поля:
    Номер документа
    Тип товаров
    Количество товаров
    Дата документа
 */
public class SupplyContract extends by.teachmeskills.accountingsystem.Document {

    private String goodsType;
    private int goodsCount;

    public SupplyContract() {
    }

    public SupplyContract(String numberOfDocument, Date dateOfDocument, String goodsType, int goodsCount) {
        super(numberOfDocument, dateOfDocument);
        this.goodsType = goodsType;
        this.goodsCount = goodsCount;
    }

    @Override
    public String getInfo() {
        return goodsType + " Supply Contract № " + numberOfDocument + " of "  + dateOfDocument + ". " +
                "Amount: " + goodsCount;
    }
}
