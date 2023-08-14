package model;

public class Score {
  private  String id;
  public  String cid;
  private double score;

  public Score() {
  }

  protected boolean canEqual(final Object other) {
    return other instanceof Score;
  }

  public String getId() {
    return this.id;
  }

  public String getCid() {
    return this.cid;
  }

  public double getScore() {
    return this.score;
  }

  public void setId(String id) {
    this.id = id;
  }

  public void setCid(String cid) {
    this.cid = cid;
  }

  public void setScore(double score) {
    this.score = score;
  }

  public boolean equals(final Object o) {
    if (o == this) return true;
    if (!(o instanceof Score)) return false;
    final Score other = (Score) o;
    if (!other.canEqual((Object) this)) return false;
    final Object this$id = this.getId();
    final Object other$id = other.getId();
    if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
    final Object this$cid = this.getCid();
    final Object other$cid = other.getCid();
    if (this$cid == null ? other$cid != null : !this$cid.equals(other$cid)) return false;
    if (Double.compare(this.getScore(), other.getScore()) != 0) return false;
    return true;
  }

  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final Object $id = this.getId();
    result = result * PRIME + ($id == null ? 43 : $id.hashCode());
    final Object $cid = this.getCid();
    result = result * PRIME + ($cid == null ? 43 : $cid.hashCode());
    final long $score = Double.doubleToLongBits(this.getScore());
    result = result * PRIME + (int) ($score >>> 32 ^ $score);
    return result;
  }

  public String toString() {
    return "Score(id=" + this.getId() + ", cid=" + this.getCid() + ", score=" + this.getScore() + ")";
  }
}
