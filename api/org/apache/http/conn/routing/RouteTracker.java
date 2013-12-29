package org.apache.http.conn.routing;

// Droidsafe Imports
import droidsafe.runtime.*;
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import java.net.InetAddress;

import org.apache.http.HttpHost;






public final class RouteTracker implements RouteInfo, Cloneable {
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:17.986 -0500", hash_original_field = "905C01B4FE2157113AE81815E13AB5AC", hash_generated_field = "7B58806231BEF3BA039CB1C0F515C7D6")

    private  HttpHost targetHost;
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:17.987 -0500", hash_original_field = "6D0817E97781DDC5DCC8C96F35E70EDB", hash_generated_field = "10EEA7EDCC69FFFCA8BA704DF8B9F4B1")

    private  InetAddress localAddress;
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:17.988 -0500", hash_original_field = "F29BF14E2D06802EFFABC46F01FDE626", hash_generated_field = "AE881BEA99A956FB32928BC2C30B9E85")

    // now follow attributes that indicate the established route

    /** Whether the first hop of the route is established. */
    private boolean connected;
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:17.989 -0500", hash_original_field = "C347087C6B3C58ACC349324C1DD767B1", hash_generated_field = "9682DC3432E3E3ED390A25A380BAA9D2")

    private HttpHost[] proxyChain;
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:17.990 -0500", hash_original_field = "57EDF877C937AB638E451F146941127D", hash_generated_field = "E015AA325755E4410D4EEEB2DE5795E3")

    private TunnelType tunnelled;
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:17.990 -0500", hash_original_field = "5333F91ABB8C106413CA644E1B704E25", hash_generated_field = "54A65546030D5940821BF07A848F0902")

    private LayerType layered;
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:17.991 -0500", hash_original_field = "63DC6869FF37EDAA23661806B080C4ED", hash_generated_field = "D17DE8BC324386A0F759A8245C34BC17")

    private boolean secure;


    /**
     * Creates a new route tracker.
     * The target and origin need to be specified at creation time.
     *
     * @param target    the host to which to route
     * @param local     the local address to route from, or
     *                  <code>null</code> for the default
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:17.992 -0500", hash_original_method = "225F1E2FD25662F69AE6A7484F5A3DE6", hash_generated_method = "0B873B5BDB61A0A73ACAAADB7F7D472A")
    public RouteTracker(HttpHost target, InetAddress local) {
        if (target == null) {
            throw new IllegalArgumentException("Target host may not be null.");
        }
        this.targetHost   = target;
        this.localAddress = local;
        this.tunnelled    = TunnelType.PLAIN;
        this.layered      = LayerType.PLAIN;
    }


    /**
     * Creates a new tracker for the given route.
     * Only target and origin are taken from the route,
     * everything else remains to be tracked.
     *
     * @param route     the route to track
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:17.993 -0500", hash_original_method = "9F2302B948E2DACBF43BEB44AB6E1806", hash_generated_method = "50FA3A9A4962DBECF2BDBFD829E818F4")
    public RouteTracker(HttpRoute route) {
        this(route.getTargetHost(), route.getLocalAddress());
    }


    /**
     * Tracks connecting to the target.
     *
     * @param secure    <code>true</code> if the route is secure,
     *                  <code>false</code> otherwise
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:17.994 -0500", hash_original_method = "BF1F9DC8D5382B51655F853917583FAE", hash_generated_method = "34668A5982D6B9136EC1FEE0CEB13223")
    public final void connectTarget(boolean secure) {
        if (this.connected) {
            throw new IllegalStateException("Already connected.");
        }
        this.connected = true;
        this.secure = secure;
    }


    /**
     * Tracks connecting to the first proxy.
     *
     * @param proxy     the proxy connected to
     * @param secure    <code>true</code> if the route is secure,
     *                  <code>false</code> otherwise
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:17.995 -0500", hash_original_method = "3003DC7DA59FD970800BABF8F86CE4CE", hash_generated_method = "A05F49A324F76D94861C4DC456DEFD13")
    public final void connectProxy(HttpHost proxy, boolean secure) {
        if (proxy == null) {
            throw new IllegalArgumentException("Proxy host may not be null.");
        }
        if (this.connected) {
            throw new IllegalStateException("Already connected.");
        }
        this.connected  = true;
        this.proxyChain = new HttpHost[]{ proxy };
        this.secure     = secure;
    }


    /**
     * Tracks tunnelling to the target.
     *
     * @param secure    <code>true</code> if the route is secure,
     *                  <code>false</code> otherwise
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:17.996 -0500", hash_original_method = "E27069CB33BE85EAA2A2A23BD0F575F7", hash_generated_method = "6A98932C22C2CB8ABCF2AF613C907DAD")
    public final void tunnelTarget(boolean secure) {
        if (!this.connected) {
            throw new IllegalStateException("No tunnel unless connected.");
        }
        if (this.proxyChain == null) {
            throw new IllegalStateException("No tunnel without proxy.");
        }
        this.tunnelled = TunnelType.TUNNELLED;
        this.secure    = secure;
    }


    /**
     * Tracks tunnelling to a proxy in a proxy chain.
     * This will extend the tracked proxy chain, but it does not mark
     * the route as tunnelled. Only end-to-end tunnels are considered there.
     *
     * @param proxy     the proxy tunnelled to
     * @param secure    <code>true</code> if the route is secure,
     *                  <code>false</code> otherwise
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:17.996 -0500", hash_original_method = "F92C099980BF3075944300484370C03E", hash_generated_method = "77BC8B89B31A6D4C76D7878ADA540AEF")
    public final void tunnelProxy(HttpHost proxy, boolean secure) {
        if (proxy == null) {
            throw new IllegalArgumentException("Proxy host may not be null.");
        }
        if (!this.connected) {
            throw new IllegalStateException("No tunnel unless connected.");
        }
        if (this.proxyChain == null) {
            throw new IllegalStateException("No proxy tunnel without proxy.");
        }

        // prepare an extended proxy chain
        HttpHost[] proxies = new HttpHost[this.proxyChain.length+1];
        System.arraycopy(this.proxyChain, 0,
                         proxies, 0, this.proxyChain.length);
        proxies[proxies.length-1] = proxy;

        this.proxyChain = proxies;
        this.secure     = secure;
    }


    /**
     * Tracks layering a protocol.
     *
     * @param secure    <code>true</code> if the route is secure,
     *                  <code>false</code> otherwise
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:17.997 -0500", hash_original_method = "54E7131A3C39BD59A18A0ED51B306BB3", hash_generated_method = "D579B0D15373BD7654C8DE6DBEC8A9F4")
    public final void layerProtocol(boolean secure) {
        // it is possible to layer a protocol over a direct connection,
        // although this case is probably not considered elsewhere
        if (!this.connected) {
            throw new IllegalStateException
                ("No layered protocol unless connected.");
        }
        this.layered = LayerType.LAYERED;
        this.secure  = secure;
    }



    // non-JavaDoc, see interface RouteInfo
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:17.998 -0500", hash_original_method = "00F8E4422BF57DE6758D681F4A99BDB6", hash_generated_method = "3CF09B50D9FFB38E80EC0DF2754F3C7C")
    public final HttpHost getTargetHost() {
        return this.targetHost;
    }


    // non-JavaDoc, see interface RouteInfo
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:17.999 -0500", hash_original_method = "28495B9032685860E947A62701D0E919", hash_generated_method = "B1EF19B51880E604C3C8A9B2EC317276")
    public final InetAddress getLocalAddress() {
        return this.localAddress;
    }


    // non-JavaDoc, see interface RouteInfo
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:18.000 -0500", hash_original_method = "6ABB5CCC8F0E8E8F1BDF34E043639F85", hash_generated_method = "AD1EC8D5550945F77A5A84A92BB90212")
    public final int getHopCount() {
        int hops = 0;
        if (this.connected) {
            if (proxyChain == null)
                hops = 1;
            else
                hops = proxyChain.length + 1;
        }
        return hops;
    }


    // non-JavaDoc, see interface RouteInfo
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:18.001 -0500", hash_original_method = "CFC4B3441FDC551CC1F391519968AE1F", hash_generated_method = "357DFC3EEE7A7ACCEF102E9E374192CE")
    public final HttpHost getHopTarget(int hop) {
        if (hop < 0)
            throw new IllegalArgumentException
                ("Hop index must not be negative: " + hop);
        final int hopcount = getHopCount();
        if (hop >= hopcount) {
            throw new IllegalArgumentException
                ("Hop index " + hop +
                 " exceeds tracked route length " + hopcount +".");
        }

        HttpHost result = null;
        if (hop < hopcount-1)
            result = this.proxyChain[hop];
        else
            result = this.targetHost;

        return result;
    }


    // non-JavaDoc, see interface RouteInfo
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:18.002 -0500", hash_original_method = "E9E1E8AC6D9C2477F7E0F63BF0C4ED60", hash_generated_method = "30E7E8E67A319853D2C851FAF279DA52")
    public final HttpHost getProxyHost() {
        return (this.proxyChain == null) ? null : this.proxyChain[0];
    }


    // non-JavaDoc, see interface RouteInfo
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:18.003 -0500", hash_original_method = "42622BE2571C040A9FEE72D0CCBA0217", hash_generated_method = "272079035DD4B0E10E8C769843BFB4F3")
    public final boolean isConnected() {
        return this.connected;
    }


    // non-JavaDoc, see interface RouteInfo
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:18.003 -0500", hash_original_method = "350E5C2EB4A104FE6F444729C8CD5444", hash_generated_method = "34D96FF8C8A24960212FD51CCBD1FAE7")
    public final TunnelType getTunnelType() {
        return this.tunnelled;
    }


    // non-JavaDoc, see interface RouteInfo
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:18.004 -0500", hash_original_method = "5CD3D72A708D2B06B9BD542F01F3D0EE", hash_generated_method = "9C3F884A327393840A81C20C66CDA5A9")
    public final boolean isTunnelled() {
        return (this.tunnelled == TunnelType.TUNNELLED);
    }


    // non-JavaDoc, see interface RouteInfo
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:18.005 -0500", hash_original_method = "24DDB6A6987422E004B186B027F8E19E", hash_generated_method = "16B0A69A0FDF7D043EE16E0E25CFF1F6")
    public final LayerType getLayerType() {
        return this.layered;
    }


    // non-JavaDoc, see interface RouteInfo
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:18.006 -0500", hash_original_method = "90484F935FB331F087FF42A42BD08719", hash_generated_method = "C6CAA6739334D47F3B176C5B89C711DE")
    public final boolean isLayered() {
        return (this.layered == LayerType.LAYERED);
    }


    // non-JavaDoc, see interface RouteInfo
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:18.007 -0500", hash_original_method = "F448B780707B5356535204966A8ECD14", hash_generated_method = "D63F92E2829B7A464F6073C5CB36443A")
    public final boolean isSecure() {
        return this.secure;
    }


    /**
     * Obtains the tracked route.
     * If a route has been tracked, it is {@link #isConnected connected}.
     * If not connected, nothing has been tracked so far.
     *
     * @return  the tracked route, or
     *          <code>null</code> if nothing has been tracked so far
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:18.008 -0500", hash_original_method = "F708D9F908B17C9085BF9A499A01375A", hash_generated_method = "96ADD9E6FABD0224F8868F657F2EEC8B")
    public final HttpRoute toRoute() {
        return !this.connected ?
            null : new HttpRoute(this.targetHost, this.localAddress,
                                 this.proxyChain, this.secure,
                                 this.tunnelled, this.layered);
    }


    /**
     * Compares this tracked route to another.
     *
     * @param o         the object to compare with
     *
     * @return  <code>true</code> if the argument is the same tracked route,
     *          <code>false</code>
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:18.009 -0500", hash_original_method = "63363EB4B4D28F766A23B83B48599393", hash_generated_method = "83E6B08A153F5D18F61651070F02427A")
    @Override
public final boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof RouteTracker))
            return false;

        RouteTracker that = (RouteTracker) o;
        boolean equal = this.targetHost.equals(that.targetHost);
        equal &=
            ( this.localAddress == that.localAddress) ||
            ((this.localAddress != null) &&
              this.localAddress.equals(that.localAddress));
        equal &=
            ( this.proxyChain        == that.proxyChain) ||
            ((this.proxyChain        != null) &&
             (that.proxyChain        != null) &&
             (this.proxyChain.length == that.proxyChain.length));
        // comparison of actual proxies follows below
        equal &=
            (this.connected == that.connected) &&
            (this.secure    == that.secure) &&
            (this.tunnelled == that.tunnelled) &&
            (this.layered   == that.layered);

        // chain length has been compared above, now check the proxies
        if (equal && (this.proxyChain != null)) {
            for (int i=0; equal && (i<this.proxyChain.length); i++)
                equal = this.proxyChain[i].equals(that.proxyChain[i]);
        }

        return equal;
    }


    /**
     * Generates a hash code for this tracked route.
     * Route trackers are modifiable and should therefore not be used
     * as lookup keys. Use {@link #toRoute toRoute} to obtain an
     * unmodifiable representation of the tracked route.
     *
     * @return  the hash code
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:18.010 -0500", hash_original_method = "DF8EA32EAB4DFA40B45F048298D9408F", hash_generated_method = "58514B974B1316ABCC1A82491B013001")
    @Override
public final int hashCode() {

        int hc = this.targetHost.hashCode();

        if (this.localAddress != null)
            hc ^= localAddress.hashCode();
        if (this.proxyChain != null) {
            hc ^= proxyChain.length;
            for (int i=0; i<proxyChain.length; i++)
                hc ^= proxyChain[i].hashCode();
        }

        if (this.connected)
            hc ^= 0x11111111;
        if (this.secure)
            hc ^= 0x22222222;

        hc ^= this.tunnelled.hashCode();
        hc ^= this.layered.hashCode();

        return hc;
    }


    /**
     * Obtains a description of the tracked route.
     *
     * @return  a human-readable representation of the tracked route
     */
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:18.011 -0500", hash_original_method = "B9AFE31805DA49D5CF66B21B19FA6A72", hash_generated_method = "6BD011116FB54A602164B5846E190397")
    @Override
public final String toString() {
        StringBuilder cab = new StringBuilder(50 + getHopCount()*30);

        cab.append("RouteTracker[");
        if (this.localAddress != null) {
            cab.append(this.localAddress);
            cab.append("->");
        }
        cab.append('{');
        if (this.connected)
            cab.append('c');
        if (this.tunnelled == TunnelType.TUNNELLED)
            cab.append('t');
        if (this.layered == LayerType.LAYERED)
            cab.append('l');
        if (this.secure)
            cab.append('s');
        cab.append("}->");
        if (this.proxyChain != null) {
            for (int i=0; i<this.proxyChain.length; i++) {
                cab.append(this.proxyChain[i]);
                cab.append("->");
            }
        }
        cab.append(this.targetHost);
        cab.append(']');

        return cab.toString();
    }


    // default implementation of clone() is sufficient
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-27 12:47:18.012 -0500", hash_original_method = "66DEBDF0D0405CDDBB7BD5DED76064DF", hash_generated_method = "49055EB107CA2B05DED5ACBCE67DF575")
    @Override
public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    
}

