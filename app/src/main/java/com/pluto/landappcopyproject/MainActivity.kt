package com.pluto.landappcopyproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pluto.landappcopyproject.adapters.RoomAdapter
import com.pluto.landappcopyproject.datas.Room
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val mRoomList = ArrayList<Room>()

    lateinit var mRoomAdapter : RoomAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mRoomList.add( Room(9000, "서울시 남대문구", 2, "서울 남대문구의 2층 9000짜리 방입니다.") )
        mRoomList.add( Room(8000, "서울시 성북구", 6, "서울 성북구의 6층 8000짜리 방입니다.") )
        mRoomList.add( Room(7500, "서울시 노원구", 3, "서울 노원구의 3층 7500짜리 방입니다.") )
        mRoomList.add( Room(12000, "서울시 종로구", 1, "서울 종로구의 1층 1억2000짜리 방입니다.") )
        mRoomList.add( Room(8500, "서울시 도봉구", 4, "서울 도봉구의 4층 8500짜리 방입니다.") )
        mRoomList.add( Room(9500, "서울시 중랑구", -1, "서울 성북구의 지하1층 9500짜리 방입니다.") )
        mRoomList.add( Room(18000, "서울시 강남구", -2, "서울 노원구의 지하2층 1억8000짜리 방입니다.") )
        mRoomList.add( Room(14500, "서울시 강북구", 5, "서울 종로구의 5층 1억4500짜리 방입니다.") )

        mRoomAdapter = RoomAdapter(this, R.layout.room_list_item, mRoomList)
        roomListView.adapter = mRoomAdapter
    }
}