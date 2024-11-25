package com.example.oderfoodapp.fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.example.oderfoodapp.recyclerViewAdapter.PaymentInfoAdapter;

import com.example.oderfoodapp.R;

import java.util.Arrays;
import java.util.List;

public class ThanhToanFrag extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private RecyclerView recyclerView;

    public ThanhToanFrag() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static ThanhToanFrag newInstance(String param1, String param2) {
        ThanhToanFrag fragment = new ThanhToanFrag();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.thanh_toan_frag, container, false);
        recyclerView = view.findViewById(R.id.listPayment);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        // Tạo dữ liệu giả lập cho danh sách
        List<String> data = Arrays.asList("Phương thức thanh toán", "Họ tên", "Số điện thoại", "Địa chỉ", "Mã giảm giá");

        // Tạo Adapter và gán vào RecyclerView
        PaymentInfoAdapter adapter = new PaymentInfoAdapter(getContext(), data);
        recyclerView.setAdapter(adapter);

        return view;
    }
}