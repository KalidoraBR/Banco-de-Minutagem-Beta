package com.example.ui.detail;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SeriesDetailModals.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u0003*\u0004\b\u0003\u0010\u00042\u00020\u0005B'\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\u0006\u0010\u0007\u001a\u00028\u0001\u0012\u0006\u0010\b\u001a\u00028\u0002\u0012\u0006\u0010\t\u001a\u00028\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0012\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\rJ\u000e\u0010\u0013\u001a\u00028\u0001HÆ\u0003¢\u0006\u0002\u0010\rJ\u000e\u0010\u0014\u001a\u00028\u0002HÆ\u0003¢\u0006\u0002\u0010\rJ\u000e\u0010\u0015\u001a\u00028\u0003HÆ\u0003¢\u0006\u0002\u0010\rJN\u0010\u0016\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00002\b\b\u0002\u0010\u0006\u001a\u00028\u00002\b\b\u0002\u0010\u0007\u001a\u00028\u00012\b\b\u0002\u0010\b\u001a\u00028\u00022\b\b\u0002\u0010\t\u001a\u00028\u0003HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0013\u0010\u0006\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\b\u001a\u00028\u0002¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\t\u001a\u00028\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0011\u0010\r¨\u0006\u001f"}, d2 = {"Lcom/example/ui/detail/Quadruple;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "C", "D", "", "first", "second", "third", "fourth", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "getFirst", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getSecond", "getThird", "getFourth", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/example/ui/detail/Quadruple;", "equals", "", "other", "hashCode", "", "toString", "", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* data */ class Quadruple<A, B, C, D> {
    private final A first;
    private final D fourth;
    private final B second;
    private final C third;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Quadruple copy$default(Quadruple quadruple, Object obj, Object obj2, Object obj3, Object obj4, int i, Object obj5) {
        if ((i & 1) != 0) {
            obj = quadruple.first;
        }
        if ((i & 2) != 0) {
            obj2 = quadruple.second;
        }
        if ((i & 4) != 0) {
            obj3 = quadruple.third;
        }
        if ((i & 8) != 0) {
            obj4 = quadruple.fourth;
        }
        return quadruple.copy(obj, obj2, obj3, obj4);
    }

    public final A component1() {
        return this.first;
    }

    public final B component2() {
        return this.second;
    }

    public final C component3() {
        return this.third;
    }

    public final D component4() {
        return this.fourth;
    }

    public final Quadruple<A, B, C, D> copy(A first, B second, C third, D fourth) {
        return new Quadruple<>(first, second, third, fourth);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Quadruple)) {
            return false;
        }
        Quadruple quadruple = (Quadruple) other;
        return Intrinsics.areEqual(this.first, quadruple.first) && Intrinsics.areEqual(this.second, quadruple.second) && Intrinsics.areEqual(this.third, quadruple.third) && Intrinsics.areEqual(this.fourth, quadruple.fourth);
    }

    public int hashCode() {
        return ((((((this.first == null ? 0 : this.first.hashCode()) * 31) + (this.second == null ? 0 : this.second.hashCode())) * 31) + (this.third == null ? 0 : this.third.hashCode())) * 31) + (this.fourth != null ? this.fourth.hashCode() : 0);
    }

    public String toString() {
        return "Quadruple(first=" + this.first + ", second=" + this.second + ", third=" + this.third + ", fourth=" + this.fourth + ")";
    }

    public Quadruple(A a, B b, C c, D d) {
        this.first = a;
        this.second = b;
        this.third = c;
        this.fourth = d;
    }

    public final A getFirst() {
        return this.first;
    }

    public final D getFourth() {
        return this.fourth;
    }

    public final B getSecond() {
        return this.second;
    }

    public final C getThird() {
        return this.third;
    }
}
