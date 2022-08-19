package AntiRussianDefenceUnion;

public class Ukraine extends UnionCountries{

  String countryName = "Ukraine";

  public void UkraineRoleInARDU() {
    System.out.println("Ukraine is the founder of the ARDU");
  }

  @Override
  public void thisIsSpy() {
    System.out.println("There is a spy in the "+countryName);

  }

}