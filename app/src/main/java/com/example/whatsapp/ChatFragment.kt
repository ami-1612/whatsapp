package com.example.whatsapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager


private var Any.layoutManager: LinearLayoutManager
    get() {
        TODO("Not yet implemented")
    }
    set(value) {}
private var Any.adapter: ChatAdapter
    get() {
        TODO("Not yet implemented")
    }
    set(value) {}

private val Any.chatList: Any
    get() {
        TODO("Not yet implemented")
    }
private val Any.root: View?
    get() {
        TODO("Not yet implemented")
    }
const val ARG_PARAM1 = "param1"
const val ARG_PARAM2 = "param2"
var list = ArrayList<ModelData>()

var names = arrayOf(
    "jay",
    "meet",
    "aniket",
    "raj",
    "jeel",
    "parth",
    "nimesh",
    "chirag",
    "bhavy",
    "harshil",
    "manish",
    "manthan",
    "dhruvi",
    "banshi",
    "vidhi",
    "bhumi",
)

var images = arrayOf(
    R.drawable.pic1,
    R.drawable.pic2,
    R.drawable.pic3,
    R.drawable.pic4,
    R.drawable.pic5,
    R.drawable.pic6,
    R.drawable.pic7,
    R.drawable.pic8,
    R.drawable.pic9,
    R.drawable.pic10,
    R.drawable.pic1,
    R.drawable.pic2,
    R.drawable.pic3,
    R.drawable.pic4,
    R.drawable.pic5,
)

class ChatFragment : Fragment() {
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var binding = FragmentChatBinding.inflate(layoutInflater)

        for (x in 0..images.size-1 ) {
            var data = ModelData(names.get(x), images.get(x))
            list.add(data)
        }

        val also =
            LinearLayoutManager(context).also { it.also { binding.chatList.layoutManager = it } }
        binding.chatList.adapter = ChatAdapter(list)

        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ChatFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}