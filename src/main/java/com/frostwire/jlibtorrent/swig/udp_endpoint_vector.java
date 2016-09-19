/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class udp_endpoint_vector {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected udp_endpoint_vector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(udp_endpoint_vector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_udp_endpoint_vector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public udp_endpoint_vector() {
    this(libtorrent_jni.new_udp_endpoint_vector(), true);
  }

  public long size() {
    return libtorrent_jni.udp_endpoint_vector_size(swigCPtr, this);
  }

  public long capacity() {
    return libtorrent_jni.udp_endpoint_vector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    libtorrent_jni.udp_endpoint_vector_reserve(swigCPtr, this, n);
  }

  public boolean empty() {
    return libtorrent_jni.udp_endpoint_vector_empty(swigCPtr, this);
  }

  public void clear() {
    libtorrent_jni.udp_endpoint_vector_clear(swigCPtr, this);
  }

  public void push_back(udp_endpoint x) {
    libtorrent_jni.udp_endpoint_vector_push_back(swigCPtr, this, udp_endpoint.getCPtr(x), x);
  }

  public udp_endpoint get(int i) {
    return new udp_endpoint(libtorrent_jni.udp_endpoint_vector_get(swigCPtr, this, i), false);
  }

  public void set(int i, udp_endpoint val) {
    libtorrent_jni.udp_endpoint_vector_set(swigCPtr, this, i, udp_endpoint.getCPtr(val), val);
  }

}
