package org.evavdb1.icecreamshop.sellers;
import org.evavdb1.icecreamshop.exception.NoMoreIceCreamException;
import org.evavdb1.icecreamshop.eatables.*;

public interface IceCreamSeller extends Profitable {

    Cone orderCone(Flavor[] balls) throws NoMoreIceCreamException;

    IceRocket orderIceRocket() throws NoMoreIceCreamException;

    Magnum orderMagnum(MagnumType magnumType) throws NoMoreIceCreamException;

}
