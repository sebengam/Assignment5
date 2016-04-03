package za.ac.cput.assignment5.Domain;

/**
 * Created by student on 2016/04/03.
 */
public class Company
{
    private String companyName;
    private String regNumber;

    public Company(Builder builder) {

        companyName = builder.companyName;
        regNumber = builder.regNumber;


    }

    public String getCompanyName() {
        return companyName;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public static class Builder
    {

        private String companyName;
        private String regNumber;

        public Builder (String regNumber){
            this.regNumber = regNumber; // compulsary
        }


        public Builder companyName(String companyName) {
            this.companyName = companyName;
            return this;
        }

        public Builder copy(Company company){
            this.companyName = company.getCompanyName();
            this.regNumber = company.getRegNumber();

            return this;
        }

        public Company build() {
            return new Company(this);
        }

    }

}
