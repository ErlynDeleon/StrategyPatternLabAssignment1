public class Knight extends Character {
  public Knight() {
      super(new SwingSword(), new Shield()); 
  }

  @Override
  public void defend() {
      new Shield().defend();
      new Dodge().defend();
      new MagicBarrier().defend();
  }
}