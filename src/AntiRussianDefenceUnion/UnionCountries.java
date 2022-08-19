package AntiRussianDefenceUnion;

public abstract class UnionCountries implements RussianSpy{
    String countryName;

    @Override
    public void thisIsSpy() {
        System.out.println("There is a spy in the "+countryName);
    }

    @Override
    public void thisIsNotSpy() {
        System.out.println("There are no spies in the "+countryName);

    }

}
