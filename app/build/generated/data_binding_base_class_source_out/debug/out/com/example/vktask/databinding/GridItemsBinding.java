// Generated by view binder compiler. Do not edit!
package com.example.vktask.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.vktask.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class GridItemsBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView gridBackground;

  @NonNull
  public final ImageView gridImageIcon;

  @NonNull
  public final FrameLayout gridImageLayout;

  @NonNull
  public final FrameLayout gridTextLayout;

  @NonNull
  public final TextView gridUserName;

  private GridItemsBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView gridBackground,
      @NonNull ImageView gridImageIcon, @NonNull FrameLayout gridImageLayout,
      @NonNull FrameLayout gridTextLayout, @NonNull TextView gridUserName) {
    this.rootView = rootView;
    this.gridBackground = gridBackground;
    this.gridImageIcon = gridImageIcon;
    this.gridImageLayout = gridImageLayout;
    this.gridTextLayout = gridTextLayout;
    this.gridUserName = gridUserName;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static GridItemsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static GridItemsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.grid_items, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static GridItemsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.gridBackground;
      ImageView gridBackground = ViewBindings.findChildViewById(rootView, id);
      if (gridBackground == null) {
        break missingId;
      }

      id = R.id.gridImageIcon;
      ImageView gridImageIcon = ViewBindings.findChildViewById(rootView, id);
      if (gridImageIcon == null) {
        break missingId;
      }

      id = R.id.grid_image_layout;
      FrameLayout gridImageLayout = ViewBindings.findChildViewById(rootView, id);
      if (gridImageLayout == null) {
        break missingId;
      }

      id = R.id.grid_text_layout;
      FrameLayout gridTextLayout = ViewBindings.findChildViewById(rootView, id);
      if (gridTextLayout == null) {
        break missingId;
      }

      id = R.id.gridUserName;
      TextView gridUserName = ViewBindings.findChildViewById(rootView, id);
      if (gridUserName == null) {
        break missingId;
      }

      return new GridItemsBinding((ConstraintLayout) rootView, gridBackground, gridImageIcon,
          gridImageLayout, gridTextLayout, gridUserName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}