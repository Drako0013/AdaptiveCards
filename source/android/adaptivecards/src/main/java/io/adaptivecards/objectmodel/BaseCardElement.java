/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.adaptivecards.objectmodel;

public class BaseCardElement {
  private transient long swigCPtr;
  private transient boolean swigCMemOwn;

  protected BaseCardElement(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BaseCardElement obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AdaptiveCardObjectModelJNI.delete_BaseCardElement(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    AdaptiveCardObjectModelJNI.BaseCardElement_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    AdaptiveCardObjectModelJNI.BaseCardElement_change_ownership(this, swigCPtr, true);
  }

  // check if the C++ code finds an object and just return ourselves if it doesn't
  public BaseCardElement findImplObj() {
     Object o = swigOriginalObject();
     return o != null ? (BaseCardElement)o : this; 
  }

  public BaseCardElement(CardElementType type, Spacing spacing, boolean separator) {
    this(AdaptiveCardObjectModelJNI.new_BaseCardElement__SWIG_0(type.swigValue(), spacing.swigValue(), separator), true);
    AdaptiveCardObjectModelJNI.BaseCardElement_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public BaseCardElement(CardElementType type) {
    this(AdaptiveCardObjectModelJNI.new_BaseCardElement__SWIG_1(type.swigValue()), true);
    AdaptiveCardObjectModelJNI.BaseCardElement_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public String GetElementTypeString() {
    return (getClass() == BaseCardElement.class) ? AdaptiveCardObjectModelJNI.BaseCardElement_GetElementTypeString(swigCPtr, this) : AdaptiveCardObjectModelJNI.BaseCardElement_GetElementTypeStringSwigExplicitBaseCardElement(swigCPtr, this);
  }

  public void SetElementTypeString(String value) {
    if (getClass() == BaseCardElement.class) AdaptiveCardObjectModelJNI.BaseCardElement_SetElementTypeString(swigCPtr, this, value); else AdaptiveCardObjectModelJNI.BaseCardElement_SetElementTypeStringSwigExplicitBaseCardElement(swigCPtr, this, value);
  }

  public boolean GetSeparator() {
    return (getClass() == BaseCardElement.class) ? AdaptiveCardObjectModelJNI.BaseCardElement_GetSeparator(swigCPtr, this) : AdaptiveCardObjectModelJNI.BaseCardElement_GetSeparatorSwigExplicitBaseCardElement(swigCPtr, this);
  }

  public void SetSeparator(boolean value) {
    if (getClass() == BaseCardElement.class) AdaptiveCardObjectModelJNI.BaseCardElement_SetSeparator(swigCPtr, this, value); else AdaptiveCardObjectModelJNI.BaseCardElement_SetSeparatorSwigExplicitBaseCardElement(swigCPtr, this, value);
  }

  public SWIGTYPE_p_Height GetHeight() {
    return new SWIGTYPE_p_Height(AdaptiveCardObjectModelJNI.BaseCardElement_GetHeight(swigCPtr, this), true);
  }

  public void SetHeight(SWIGTYPE_p_Height value) {
    AdaptiveCardObjectModelJNI.BaseCardElement_SetHeight(swigCPtr, this, SWIGTYPE_p_Height.getCPtr(value));
  }

  public Spacing GetSpacing() {
    return Spacing.swigToEnum((getClass() == BaseCardElement.class) ? AdaptiveCardObjectModelJNI.BaseCardElement_GetSpacing(swigCPtr, this) : AdaptiveCardObjectModelJNI.BaseCardElement_GetSpacingSwigExplicitBaseCardElement(swigCPtr, this));
  }

  public void SetSpacing(Spacing value) {
    if (getClass() == BaseCardElement.class) AdaptiveCardObjectModelJNI.BaseCardElement_SetSpacing(swigCPtr, this, value.swigValue()); else AdaptiveCardObjectModelJNI.BaseCardElement_SetSpacingSwigExplicitBaseCardElement(swigCPtr, this, value.swigValue());
  }

  public String GetId() {
    return (getClass() == BaseCardElement.class) ? AdaptiveCardObjectModelJNI.BaseCardElement_GetId(swigCPtr, this) : AdaptiveCardObjectModelJNI.BaseCardElement_GetIdSwigExplicitBaseCardElement(swigCPtr, this);
  }

  public void SetId(String value) {
    if (getClass() == BaseCardElement.class) AdaptiveCardObjectModelJNI.BaseCardElement_SetId(swigCPtr, this, value); else AdaptiveCardObjectModelJNI.BaseCardElement_SetIdSwigExplicitBaseCardElement(swigCPtr, this, value);
  }

  public CardElementType GetElementType() {
    return CardElementType.swigToEnum((getClass() == BaseCardElement.class) ? AdaptiveCardObjectModelJNI.BaseCardElement_GetElementType(swigCPtr, this) : AdaptiveCardObjectModelJNI.BaseCardElement_GetElementTypeSwigExplicitBaseCardElement(swigCPtr, this));
  }

  public String Serialize() {
    return AdaptiveCardObjectModelJNI.BaseCardElement_Serialize(swigCPtr, this);
  }

  public JsonValue SerializeToJsonValue() {
    return new JsonValue((getClass() == BaseCardElement.class) ? AdaptiveCardObjectModelJNI.BaseCardElement_SerializeToJsonValue(swigCPtr, this) : AdaptiveCardObjectModelJNI.BaseCardElement_SerializeToJsonValueSwigExplicitBaseCardElement(swigCPtr, this), true);
  }

  public static BaseActionElement DeserializeSelectAction(ElementParserRegistration elementParserRegistration, ActionParserRegistration actionParserRegistration, JsonValue json, AdaptiveCardSchemaKey key) {
    long cPtr = AdaptiveCardObjectModelJNI.BaseCardElement_DeserializeSelectAction(ElementParserRegistration.getCPtr(elementParserRegistration), elementParserRegistration, ActionParserRegistration.getCPtr(actionParserRegistration), actionParserRegistration, JsonValue.getCPtr(json), json, key.swigValue());
    return (cPtr == 0) ? null : new BaseActionElement(cPtr, true);
  }

  public JsonValue GetAdditionalProperties() {
    return new JsonValue(AdaptiveCardObjectModelJNI.BaseCardElement_GetAdditionalProperties(swigCPtr, this), true);
  }

  public void SetAdditionalProperties(JsonValue additionalProperties) {
    AdaptiveCardObjectModelJNI.BaseCardElement_SetAdditionalProperties(swigCPtr, this, JsonValue.getCPtr(additionalProperties), additionalProperties);
  }

  public Object swigOriginalObject() {
    return AdaptiveCardObjectModelJNI.BaseCardElement_swigOriginalObject(swigCPtr, this);
  }

}
