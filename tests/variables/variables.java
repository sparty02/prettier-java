public class Variables {

  public static int STATIC_VARIABLE = 123;
  private static final Logger LOGGER = LoggerFactory.getLogger(ComplexFilterTest.class);
  int packageVariable = 234;
  private int privateVariable = 345;
  private Integer nullVariable = null;
  private Integer createVariable = new Integer();
  private List<String> genericVariable1 = new List<String>();
  private Bean<String> genericVariable2 = new Bean<String>("abc");

  public void variableMethod(final int finalVariable) {
    int localVariable = 456;
    int castVariable = (int) (4 / 2);
  }

}
