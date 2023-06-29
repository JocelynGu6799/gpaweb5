package model;

public class Course {
    private String id;
    private String name;
    private double credit;

    public Course() {
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public double getCredit() {
        return this.credit;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Course)) return false;
        final Course other = (Course) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        if (Double.compare(this.getCredit(), other.getCredit()) != 0) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Course;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final long $credit = Double.doubleToLongBits(this.getCredit());
        result = result * PRIME + (int) ($credit >>> 32 ^ $credit);
        return result;
    }

    public String toString() {
        return "Course(id=" + this.getId() + ", name=" + this.getName() + ", credit=" + this.getCredit() + ")";
    }
}
