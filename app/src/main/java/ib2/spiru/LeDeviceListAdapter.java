package ib2.spiru;

import android.bluetooth.BluetoothDevice;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

class LeDeviceListAdapter extends BaseAdapter {
    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }
//    private ArrayList<BluetoothDevice> mLeDevices;
//    private LayoutInflater mInflator;
//
//    public LeDeviceListAdapter() {
//        super();
//        mLeDevices = new ArrayList<BluetoothDevice>();
////        mInflator = BluetoothActivity.scanListView.getLayoutInflater();
//    }
//
//    public void addDevice(BluetoothDevice device) {
//        if(!mLeDevices.contains(device)) {
//            mLeDevices.add(device);
//        }
//    }
//
//    public BluetoothDevice getDevice(int position) {
//        return mLeDevices.get(position);
//    }
//
//    public void clear() {
//        mLeDevices.clear();
//    }
//
//    @Override
//    public int getCount() {
//        return mLeDevices.size();
//    }
//
//    @Override
//    public Object getItem(int i) {
//        return mLeDevices.get(i);
//    }
//
//    @Override
//    public long getItemId(int i) {
//        return i;
//    }
//
//    @Override
//    public View getView(int i, View view, ViewGroup viewGroup) {
//        ViewHolder viewHolder;
//        // General ListView optimization code.
//        if (view == null) {
//            view = mInflator.inflate(R.layout.listitem_device, null);
//            viewHolder = new ViewHolder();
//            viewHolder.deviceAddress = (TextView) view.findViewById(R.id.device_address);
//            viewHolder.deviceName = (TextView) view.findViewById(R.id.device_name);
//            view.setTag(viewHolder);
//        } else {
//            viewHolder = (ViewHolder) view.getTag();
//        }
//
//        BluetoothDevice device = mLeDevices.get(i);
//        final String deviceName = device.getName();
//        if (deviceName != null && deviceName.length() > 0)
//            viewHolder.deviceName.setText(deviceName);
//        else
//            viewHolder.deviceName.setText(R.string.unknown_device);
//        viewHolder.deviceAddress.setText(device.getAddress());
//
//        return view;
//    }
}
