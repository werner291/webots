/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.cyberbotics.webots.controller;

public class CameraRecognitionObject {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CameraRecognitionObject(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CameraRecognitionObject obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        wrapperJNI.delete_CameraRecognitionObject(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setId(int value) {
    wrapperJNI.CameraRecognitionObject_id_set(swigCPtr, this, value);
  }

  public int getId() {
    return wrapperJNI.CameraRecognitionObject_id_get(swigCPtr, this);
  }

  public void setPosition(double[] value) {
    wrapperJNI.CameraRecognitionObject_position_set(swigCPtr, this, value);
  }

  public double[] getPosition() {
    return wrapperJNI.CameraRecognitionObject_position_get(swigCPtr, this);
  }

  public void setOrientation(double[] value) {
    wrapperJNI.CameraRecognitionObject_orientation_set(swigCPtr, this, value);
  }

  public double[] getOrientation() {
    return wrapperJNI.CameraRecognitionObject_orientation_get(swigCPtr, this);
  }

  public void setSize(double[] value) {
    wrapperJNI.CameraRecognitionObject_size_set(swigCPtr, this, value);
  }

  public double[] getSize() {
    return wrapperJNI.CameraRecognitionObject_size_get(swigCPtr, this);
  }

  public void setPosition_on_image(int[] value) {
    wrapperJNI.CameraRecognitionObject_position_on_image_set(swigCPtr, this, value);
  }

  public int[] getPosition_on_image() {
    return wrapperJNI.CameraRecognitionObject_position_on_image_get(swigCPtr, this);
  }

  public void setSize_on_image(int[] value) {
    wrapperJNI.CameraRecognitionObject_size_on_image_set(swigCPtr, this, value);
  }

  public int[] getSize_on_image() {
    return wrapperJNI.CameraRecognitionObject_size_on_image_get(swigCPtr, this);
  }

  public void setNumber_of_colors(int value) {
    wrapperJNI.CameraRecognitionObject_number_of_colors_set(swigCPtr, this, value);
  }

  public int getNumber_of_colors() {
    return wrapperJNI.CameraRecognitionObject_number_of_colors_get(swigCPtr, this);
  }

  public void setColors(double[] value) {
    wrapperJNI.CameraRecognitionObject_colors_set(swigCPtr, this, value);
  }

  public double[] getColors() {
    return wrapperJNI.CameraRecognitionObject_colors_get(swigCPtr, this);
  }

  public void setModel(String value) {
    wrapperJNI.CameraRecognitionObject_model_set(swigCPtr, this, value);
  }

  public String getModel() {
    return wrapperJNI.CameraRecognitionObject_model_get(swigCPtr, this);
  }

  public SWIGTYPE_p_int getPositionOnImage() {
    long cPtr = wrapperJNI.CameraRecognitionObject_getPositionOnImage(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_int(cPtr, false);
  }

  public SWIGTYPE_p_int getSizeOnImage() {
    long cPtr = wrapperJNI.CameraRecognitionObject_getSizeOnImage(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_int(cPtr, false);
  }

  public int getNumberOfColors() {
    return wrapperJNI.CameraRecognitionObject_getNumberOfColors(swigCPtr, this);
  }

  public CameraRecognitionObject() {
    this(wrapperJNI.new_CameraRecognitionObject(), true);
  }

}
