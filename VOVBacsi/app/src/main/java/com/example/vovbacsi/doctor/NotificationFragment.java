package com.example.vovbacsi.doctor;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.vovbacsi.R;

public class NotificationFragment extends Fragment {

    private TextView notificationTextView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_notification, container, false);

        // Lấy tham chiếu đến TextView để hiển thị thông báo
        notificationTextView = view.findViewById(R.id.notificationTextView);

        // Hiển thị thông báo (Cập nhật thông báo sau khi nhận thông tin lịch hẹn từ FCM)
        notificationTextView.setText("Bạn có lịch hẹn mới!");

        return view;
    }
}
