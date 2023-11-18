package com.example.tha_204117b;


import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

public class CheckDecimal implements TextWatcher {

    private EditText editText;
    private int decimalPlaces;

    public CheckDecimal(EditText editText, int decimalPlaces) {
        this.editText = editText;
        this.decimalPlaces = decimalPlaces;
    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int start, int before, int count) {

    }
    @Override
    public void onTextChanged(CharSequence charSequence, int start, int before, int count) {

    }

    @Override
    public void afterTextChanged(Editable editable) {
        if (!editable.toString().isEmpty() && editable.toString().contains(".")) {
            int index = editable.toString().indexOf(".");
            if (editable.length() - index > decimalPlaces + 1) {
                // Remove excess decimal places
                editable.delete(index + decimalPlaces + 1, editable.length());
            }
 }
}
}