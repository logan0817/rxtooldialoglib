package com.rxtooldialog.dialog;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

import app.rxtooldialog.com.libtooldialog.R;


/**
 * Description :  <br/>
 * author : gansheng<br/>
 * date : 2017/11/3 0003<br/>
 * email : notwalnut@163.com <br/>
 */


public class ExampleDialog extends Activity {

    private Context mContext;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        mContext = this;
        super.onCreate(savedInstanceState);
    }

    private void initWheelYearMonthDayDialog() {
        // ------------------------------------------------------------------选择日期开始
        mRxDialogWheelYearMonthDay = new RxDialogWheelYearMonthDay(this, 1994, 2017);
        mRxDialogWheelYearMonthDay.getSureView().setOnClickListener(
                new View.OnClickListener() {

                    @Override
                    public void onClick(View arg0) {
                        if (mRxDialogWheelYearMonthDay.getCheckBoxDay().isChecked()) {
                         /*   mButtonDialogWheelYearMonthDay.setText(
                                    mRxDialogWheelYearMonthDay.getSelectorYear() + "年"
                                            + mRxDialogWheelYearMonthDay.getSelectorMonth() + "月"
                                            + mRxDialogWheelYearMonthDay.getSelectorDay() + "日");*/
                        } else {
                            /*mButtonDialogWheelYearMonthDay.setText(
                                    mRxDialogWheelYearMonthDay.getSelectorYear() + "年"
                                            + mRxDialogWheelYearMonthDay.getSelectorMonth() + "月");*/
                        }
                        mRxDialogWheelYearMonthDay.cancel();
                    }
                });
        mRxDialogWheelYearMonthDay.getCancleView().setOnClickListener(
                new View.OnClickListener() {

                    @Override
                    public void onClick(View arg0) {
                        mRxDialogWheelYearMonthDay.cancel();
                    }
                });
        // ------------------------------------------------------------------选择日期结束
    }
    private RxDialogWheelYearMonthDay mRxDialogWheelYearMonthDay;
    public void onClick(int i) {
        switch (i) {
            case 1:
                RxDialog rxDialog = new RxDialog(mContext, R.style.tran_dialog);
                View view1 = LayoutInflater.from(mContext).inflate(R.layout.image, null);
                ImageView page_item = (ImageView) view1.findViewById(R.id.page_item);
                page_item.setImageResource(R.drawable.coin);
                rxDialog.setContentView(view1);
                rxDialog.show();
                break;
            case 2:
                final RxDialogSure rxDialogSure = new RxDialogSure(mContext);//提示弹窗
                rxDialogSure.getLogoView().setImageResource(R.drawable.logo);
                rxDialogSure.getSureView().setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        rxDialogSure.cancel();
                    }
                });
                rxDialogSure.show();
                break;
            case 3:
                final RxDialogSureCancel rxDialogSureCancel = new RxDialogSureCancel(mContext);//提示弹窗
                rxDialogSureCancel.getTitleView().setBackgroundResource(R.drawable.logo);
                rxDialogSureCancel.getSureView().setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        rxDialogSureCancel.cancel();
                    }
                });
                rxDialogSureCancel.getCancelView().setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        rxDialogSureCancel.cancel();
                    }
                });
                rxDialogSureCancel.show();
                break;
            case 4:
                final RxDialogEditSureCancel rxDialogEditSureCancel = new RxDialogEditSureCancel(mContext);//提示弹窗
                rxDialogEditSureCancel.getTitleView().setBackgroundResource(R.drawable.logo);
                rxDialogEditSureCancel.getSureView().setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        rxDialogEditSureCancel.cancel();
                    }
                });
                rxDialogEditSureCancel.getCancelView().setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        rxDialogEditSureCancel.cancel();
                    }
                });
                rxDialogEditSureCancel.show();
                break;
            case 5:
                if (mRxDialogWheelYearMonthDay == null) {
                    initWheelYearMonthDayDialog();
                }
                mRxDialogWheelYearMonthDay.show();
                break;
            case 6:
                RxDialogShapeLoading rxDialogShapeLoading = new RxDialogShapeLoading(this);
                rxDialogShapeLoading.show();
                break;
            case 7:
                new RxDialogAcfunVideoLoading(this).show();
                break;
            case 8:
                RxDialogLoading rxDialogLoading = new RxDialogLoading(mContext);
                rxDialogLoading.show();
                //rxDialogLoading.cancel(RxDialogLoading.RxCancelType.error,"");
                break;
            case 9:
                RxDialogScaleView rxDialogScaleView = new RxDialogScaleView(mContext);
                rxDialogScaleView.setImageAssets("squirrel.jpg");
                rxDialogScaleView.show();
                break;
                default:
                    break;
        }
    }
}
