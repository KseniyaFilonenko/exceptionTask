import java.util.Date;

/*
Контракт с сотрудником. Содержит поля:
    Номер документа
    Дата документа
    Дата окончания контракта
    Имя сотрудника
 */
public class EmploymentContract extends by.teachmeskills.accountingsystem.Document {

    private String employeeName;
    private Date endDate;

    public EmploymentContract() {
    }

    public EmploymentContract(String numberOfDocument, Date dateOfDocument, String employeeName, Date endDate) {
        super(numberOfDocument, dateOfDocument);
        this.employeeName = employeeName;
        this.endDate = endDate;
    }

    @Override
    public String getInfo() {
        return "EmploymentContract № " + numberOfDocument + " of " + dateOfDocument + " with " + employeeName + ". " +
                "End date: " + endDate;
    }
}
