package com.hentaios.walls.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager

import com.hentaios.walls.R
import com.hentaios.walls.adapters.WallAdapter
import com.hentaios.walls.models.WallCollection
import com.hentaios.walls.models.Wallpaper
import com.hentaios.walls.utils.GridSpacingItemDecoration
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val layoutManager = GridLayoutManager(requireContext(), 3)
        val adapter = WallAdapter(requireContext())
        collection_recyclerview.adapter = adapter
        collection_recyclerview.addItemDecoration(GridSpacingItemDecoration(3, 50))
        collection_recyclerview.layoutManager = layoutManager

        val list = listOf(
            WallCollection("Ahegao", listOf(Wallpaper("https://i.ibb.co/b25VFdB/wall.png", "Raphielscape"))),
            WallCollection("NTR", listOf(Wallpaper("https://i.imgur.com/GL7igry.png", "Raphielscape"))),
            WallCollection("Living in hentai", listOf(Wallpaper("https://i.imgur.com/XULiMJ5.jpg", "Raphielscape"))),
            WallCollection("Lewds", listOf(Wallpaper("https://i.imgur.com/ZBk3W8l.jpg", "Raphielscape"))),
            WallCollection("Waifus", listOf(Wallpaper("https://i.imgur.com/kZPEccB.jpg", "Raphielscape"))),
            WallCollection("Mind Break", listOf(Wallpaper("https://i.imgur.com/O5mO0wh.jpg", "Raphielscape")))
        )

        adapter.updateData(list)
    }
}
